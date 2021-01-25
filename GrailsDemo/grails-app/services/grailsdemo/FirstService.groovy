package grailsdemo

import com.utopios.exception.SpecialExeption
import grails.transaction.Transactional
import org.springframework.transaction.annotation.Propagation
import org.springframework.web.context.request.RequestContextHolder

@Transactional(rollbackFor = SpecialExeption, propagation = Propagation.REQUIRES_NEW)
class FirstService {
    def method1() {
        RequestContextHolder.currentRequestAttributes().getSession().test = "value of test session 2"
        throw new RuntimeException("Error seting test session")
//        "Hello from service"
    }

    def method2() {
        RequestContextHolder.currentRequestAttributes().getSession().test
    }
}
