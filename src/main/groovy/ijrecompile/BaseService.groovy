package ijrecompile

import grails.artefact.Service

abstract class BaseService implements Service {

	public static class BaseWrapper {
		String txt
	}

	public static BaseWrapper wrap(String txt) {
		BaseWrapper wrapper = new BaseWrapper()
		wrapper.txt = txt
		return wrapper
	}

}
