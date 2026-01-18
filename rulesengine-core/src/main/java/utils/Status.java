package utils;

public enum Status {

    APPROVED,
    NOT_APPROVED;

    private Status getStatus(String status) {
       return Status.valueOf(status);
    }

}
