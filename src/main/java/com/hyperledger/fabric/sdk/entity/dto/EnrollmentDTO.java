package com.hyperledger.fabric.sdk.entity.dto;

import org.hyperledger.fabric.sdk.Enrollment;

import java.security.PrivateKey;

/**
 * Created by answer on 2018-08-28 15:20
 */
public class EnrollmentDTO implements Enrollment {
    private String cert;
    private PrivateKey key;


    public EnrollmentDTO(String cert, PrivateKey key) {
        this.cert = cert;
        this.key = key;
    }

    @Override
    public PrivateKey getKey() {
        return key;
    }

    @Override
    public String getCert() {
        return cert;
    }
}