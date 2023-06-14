package com.assignment.task1;

public class JavaWorld implements JavaLanguage {
	private PythonWorld python;
	
	public JavaWorld(PythonWorld python) {
		super();
		this.python = python;
	}
	@Override
	public String learningJava() {
	
		return "I am learning java";
	}
	public String learningPython() {
		return python.learningPython();
	}
}
