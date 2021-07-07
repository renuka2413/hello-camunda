package net.example.camunda.service;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.runtime.ProcessInstanceWithVariables;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.springframework.stereotype.Service;

@Service
public class CamundaTriggerService {

	public void triggerProcess(String processKey, String varName) throws Exception {
			ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();

			ProcessInstantiationBuilder instance = engine.getRuntimeService().createProcessInstanceByKey(processKey);	
			ProcessInstanceWithVariables response = instance.executeWithVariablesInReturn();
		
	}	
}
