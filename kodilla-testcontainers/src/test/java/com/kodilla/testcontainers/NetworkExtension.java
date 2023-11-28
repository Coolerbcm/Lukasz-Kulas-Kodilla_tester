package com.kodilla.testcontainers;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class NetworkExtension implements AfterEachCallback, BeforeEachCallback {

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
    }
}
