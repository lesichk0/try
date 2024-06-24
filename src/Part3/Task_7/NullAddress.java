package Part3.Task_7;

class NullAddress extends Address {
    private static final String NULL_ADDRESS_STRING = "No Address";
    private static final NullAddress INSTANCE = new NullAddress();

    private NullAddress() {
        super(NULL_ADDRESS_STRING, NULL_ADDRESS_STRING);
    }

    // Метод для отримання єдиного екземпляра Null-об'єкта
    public static NullAddress getInstance() {
        return INSTANCE;
    }

    // Перевизначення методів, які повертають дані об'єкта Address
    @Override
    public String getStreet() {
        return NULL_ADDRESS_STRING;
    }

    @Override
    public String getCity() {
        return NULL_ADDRESS_STRING;
    }
}
