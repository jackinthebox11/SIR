package fr.istic.tpjpa.rest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.istic.tpjpa.domain.Device;
import fr.istic.tpjpa.domain.Heater;
import fr.istic.tpjpa.domain.Home;

@Path("/hello")
public class SampleWebService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello, how are you?";
	}
	
	@GET
	@Path("/home")
	@Produces(MediaType.APPLICATION_JSON)
	public Home getHome() {
		Home h = new Home();
		h.setAdresse("toto");
		Heater h1 = new Heater();
		h1.setPower(34);
		Heater h2 = new Heater();
		h2.setPower(45);
		List<Device> ld = new ArrayList<Device>();
		h.setDevices(ld);
		return h;
	}

}