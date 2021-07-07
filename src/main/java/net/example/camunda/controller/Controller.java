package net.example.camunda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.example.camunda.service.CamundaTriggerService;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	CamundaTriggerService camundaTriggerService;
	
	
	@GetMapping("/processHelloCamunda/{processKey}/var/{varName}")
	public void getCamunda(@PathVariable String processKey, @PathVariable String varName) throws Exception {
        camundaTriggerService.triggerProcess(processKey, varName);
	}
}
