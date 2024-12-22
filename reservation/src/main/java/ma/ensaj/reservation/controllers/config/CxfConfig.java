package ma.ensaj.reservation.controllers.config;

import ma.ensaj.reservation.controllers.soap.ChambreSoapController;
import ma.ensaj.reservation.controllers.soap.ClientSoapController;
import ma.ensaj.reservation.controllers.soap.ReservationSoapController;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CxfConfig {

    @Autowired
    private ChambreSoapController chambreSoapController;

    @Autowired
    private ClientSoapController clientSoapController;

    @Autowired
    private ReservationSoapController reservationSoapController;

    @Autowired
    private Bus bus;

    @Bean
    public EndpointImpl chambreEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, chambreSoapController);
        endpoint.publish("/chambreSoap");
        return endpoint;
    }

    @Bean
    public EndpointImpl clientEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, clientSoapController);
        endpoint.publish("/clientSoap");
        return endpoint;
    }

    @Bean
    public EndpointImpl reservationEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, reservationSoapController);
        endpoint.publish("/reservationSoap");
        return endpoint;
    }
}

