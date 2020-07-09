package pl.wkos.homework101;

public interface Rentable {
    void rent(String firstName, String lastName, String id);
    void handOver();
    boolean isRent();
}
