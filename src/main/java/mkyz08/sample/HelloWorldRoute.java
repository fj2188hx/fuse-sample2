package mkyz08.sample;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("seda:hello_world")
                .routeId("hello world route")
                .setBody(simple("Hello World : ${body}"))
                .to("stream:out");
    }
}
