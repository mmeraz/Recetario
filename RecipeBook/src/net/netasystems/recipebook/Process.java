package net.netasystems.recipebook;

import java.util.ArrayList;
import java.util.List;

public class Process {

	private List<String> step;
	private static int counterStep;
	private int idStep;
	
	public Process() {
		step = new ArrayList<String>();
	}
	
	public Process(List<String> step) {
		this.step = step;
	}
	
	public void addProcess(String s) {
		if(s.isEmpty()) {
			System.out.println("tu pasos no se...");
		}else {
		step.add(s);
		}
	}

	public List<String> getStep() {
		return step;
	}

	public void setStep(List<String> step) {
		this.step = step;
	}

	public static int getCounterStep() {
		return counterStep;
	}

	public static void setCounterStep(int counterStep) {
		Process.counterStep = counterStep;
	}

	public int getIdStep() {
		return idStep;
	}

	public void setIdStep(int idStep) {
		this.idStep = idStep;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idStep;
		result = prime * result + ((step == null) ? 0 : step.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Process other = (Process) obj;
		if (idStep != other.idStep)
			return false;
		if (step == null) {
			if (other.step != null)
				return false;
		} else if (!step.equals(other.step))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Paso"+ idStep +".- "+ step+"\n"  ;
	}
	
	
	
}
