package de.quantummaid.tutorials;

import de.quantummaid.quantummaid.QuantumMaid;

public final class WebService {
    private static final int PORT = 8080;

    public static void main(final String[] args) {
        createQuantumMaid(PORT).run();
    }

    public static QuantumMaid createQuantumMaid(final int port) {
        return QuantumMaid.quantumMaid()
                .get("/hello/<name>", GreetingUseCase.class)
                .withLocalHostEndpointOnPort(port);
    }
}