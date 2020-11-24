package com.police.bundobustservice.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.police.bundobustservice.model.GenericResponse;
import com.police.bundobustservice.model.MyStaff;
import com.police.bundobustservice.model.MystaffDemo;
import com.police.bundobustservice.model.Registerbundobust;
import com.police.bundobustservice.repository.MystaffRepo;
import com.police.bundobustservice.service.RegisterbundobustService;

@RestController
@RequestMapping("/api")
public class BundobustController {

	@Autowired
	private RegisterbundobustService registerbundobustservice;
	@Autowired
	private MystaffRepo repo;

	@PostMapping(value = "/bundobust")
	public GenericResponse<String> createbundobust(@Valid @RequestBody Registerbundobust registerbundobust,
			BindingResult binding) throws Exception {

		String status = registerbundobustservice.createbundobust(registerbundobust);
		GenericResponse<String> response = new GenericResponse<String>();
		response.setMsg(status);
		if (binding.hasFieldErrors()) {
			DefaultMessageSourceResolvable error = binding.getFieldError();
			throw new Exception(error.getDefaultMessage());
		}

		return response;
	}

	@GetMapping("/mystaff")
	public GenericResponse<List<MyStaff>> getmystaff() {

		List<MystaffDemo> staff = repo.findAll();

		List<MyStaff> staffdata = new ArrayList<MyStaff>();

		if (staff != null) {
			for (MystaffDemo staff1 : staff) {
				List<MyStaff> staff2 = staff1.getMystaff();
				for (MyStaff staff3 : staff2) {
					MyStaff response = new MyStaff();

					response.setCircle(staff3.getCircle());
					response.setDistrict(staff3.getDistrict());
					response.setJournalIdNo(staff3.getJournalIdNo());
					response.setMobileNo(staff3.getMobileNo());
					response.setName(staff3.getName());
					response.setPolicestation(staff3.getPolicestation());
					response.setProfile(staff3.getProfile());
					response.setRank(staff3.getRank());
					response.setSdpo(staff3.getSdpo());
					response.setSno(staff3.getSno());
					response.setStatus(staff3.getStatus());
					staffdata.add(response);

				}

			}
		}

		GenericResponse<List<MyStaff>> res = new GenericResponse<List<MyStaff>>();
		res.setData(staffdata);

		return res;

	}

}
