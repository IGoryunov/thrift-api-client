package com.credits.general.serialize;

import java.io.*;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

public class Serializer {

    public static Object deserialize(byte[] contractState, ClassLoader classLoader) {
        Object instance;
        requireNonNull(contractState, "executor state can't be null");
        try (ObjectInputStream ous = new ObjectInputStreamWithClassLoader(new ByteArrayInputStream(contractState), classLoader)) {
            instance = ous.readUnshared();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("cannot deserialize smart contract instance. " + e);
        }
        return Optional.ofNullable(instance).orElseThrow(() -> new RuntimeException("cannot deserialize object. Object size = " + contractState.length));
    }

    public static byte[] serialize(Object instance) {
        requireNonNull(instance, "instance can't be null");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream ous = new ObjectOutputStream(baos)) {
            ous.writeUnshared(instance);
        } catch (IOException e) {
            throw new RuntimeException("cannot serialize smart contract instance. " + e);
        }
        return baos.toByteArray();
    }
}
