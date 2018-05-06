package by.gsu.omglab;

public class Computer implements Comparable<Computer>{
	private int frequency;
	private int ram;
	private String gpu;
	public Computer(int frequency, int ram, String gpu) {
		super();
		this.frequency = frequency;
		this.ram = ram;
		this.gpu = gpu;
	}
	public Computer() {
		super();
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public int getIOPS() {
		return frequency * (frequency/2 + frequency/4);
	}
	@Override
	public int compareTo(Computer arg0) {
		return this.gpu.compareTo(arg0.gpu);
	}
	@Override
	public String toString() {
		return frequency + " " + ram + " " + gpu + " " + getIOPS();
	}
	
}
