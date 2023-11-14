package uk.ng85.modules.persistence.api.model;

public class RepositoryException extends Exception {

    public RepositoryException(String message) {
        super(message);
    }

    public RepositoryException(String message, Exception exception) {
        super(message, exception);
    }

}