# SpringAnnotation

A small exercise in Spring Framework dependency injection with Java-based configuration and annotations, without any XML.

## What it shows

- `AppConfig` is a `@Configuration` class with `@ComponentScan`, so Spring finds the beans by itself.
- `MobileProcessor` is an interface with two `@Component` implementations, `Bionic` and `snapdragon`.
- `Sony` gets its processor with `@Autowired`, and `@Qualifier("bionic")` picks one of the two implementations.
- `App` starts an `AnnotationConfigApplicationContext`, gets the `Sony` bean and calls it.

Change the qualifier to `"snapdragon"` to see Spring inject the other implementation.

## Run it

Requires Java and Maven. The project uses Spring Context 5.1.

```bash
mvn compile exec:java -Dexec.mainClass=com.sp.springannotation.App
```

Expected output:

```text
sony z5, 3gb ram, and 21mb camera
second best cpu
```

See also [SpringV1-V2](https://github.com/Ahmed-Manai/SpringV1-V2), the same ideas with XML configuration.
