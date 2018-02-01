package ijrecompile

class DemoService extends BaseService {

    def wrapString(String txt) {
		BaseWrapper wrap = wrap(txt)
		println 's'
		return wrap.txt
    }
}
