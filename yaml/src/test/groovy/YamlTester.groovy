/**
 * Created by vyas on 6/27/15.
 */

import org.yaml.snakeyaml.Yaml


class YamlTester extends spock.lang.Specification  {

    def "testYaml"() {

        Yaml yaml = new Yaml()
        def obj = yaml.load("""
                            a: 1
                            b: 2
                            c:
                              - aaa
                              - bbb""")
        expect:
        assert obj.a == 1
        assert obj.b == 2
        assert obj.c == ["aaa", "ccc"]
    }
}
