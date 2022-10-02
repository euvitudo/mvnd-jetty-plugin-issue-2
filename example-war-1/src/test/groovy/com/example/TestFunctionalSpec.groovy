package com.example

import spock.lang.Specification

class TestFunctionalSpec extends Specification {

    def 'test'() {
        given:
        String url = 'http://localhost:18080/mvnd-test'

        when:
        String contents = new URL(url).text

        then:
        contents =~ 'DOCTYPE'
    }
}
