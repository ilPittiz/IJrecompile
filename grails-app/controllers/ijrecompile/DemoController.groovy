package ijrecompile

class DemoController {
	
	DemoService demoService

    def index() {
		render demoService.wrapString('wrapped')
	}
}
