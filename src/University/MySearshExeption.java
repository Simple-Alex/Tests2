package University;

public class MySearshExeption extends NullPointerException {
    @Override
    public String getMessage() {
        return "Такого студента нет ";
    }
}
