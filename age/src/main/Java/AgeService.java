package ageservice;


import javax.jws.WebMethod;
import javax.jws.WebService;
import java.math.BigInteger;
import java.time.Year;


@WebService(serviceName = "getAge")

public class AgeService implements generated.ageservice.AgeService {

    @WebMethod
    public String getAge(Integer naissance) {

        return "Votre âge est de " + (Year.now().getValue()-naissance) + "ans";
    }
}

