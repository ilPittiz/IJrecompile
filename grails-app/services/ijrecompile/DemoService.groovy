package ijrecompile

class DemoService extends BaseService {

    def wrapString(String txt) {
		BaseWrapper wrap = wrap(txt)
		println 'edit me'
		return wrap.txt
    }
}
