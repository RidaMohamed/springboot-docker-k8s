FROM openjdk:11

EXPOSE 8080

ADD target/django-h.jar django-h.jar

ENTRYPOINT ["java", "-jar", "django-h.jar"]