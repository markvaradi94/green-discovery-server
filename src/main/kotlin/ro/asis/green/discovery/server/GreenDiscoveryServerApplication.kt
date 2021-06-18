package ro.asis.green.discovery.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class GreenDiscoveryServerApplication

fun main(args: Array<String>) {
    runApplication<GreenDiscoveryServerApplication>(*args)
}
