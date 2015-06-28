/**
 * Created by vyas on 6/27/15.
 */

import org.yaml.snakeyaml.Yaml
import spock.lang.Specification


class YamlTester extends Specification  {

    def "read Yaml"() {

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
        assert obj.c == ["aaa", "bbb"]
    }

    def "create Yaml"(){

        def map = [name: "Lal", aliases: ['Lalettan', 'Lalu']]
        Yaml yaml = new Yaml()
        String output = yaml.dump(map)
        expect:
        assert output ==
                '''name: Lal
aliases: [Lalettan, Lalu]
'''
    }
}
