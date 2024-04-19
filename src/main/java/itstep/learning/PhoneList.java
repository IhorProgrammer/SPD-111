package itstep.learning;

import java.util.HashMap;
import java.util.Map;

public class PhoneList {

    private Map<Integer, User> phoneList = new HashMap<>();

    public void printAll() {
        for (Integer key : phoneList.keySet()) {
            User val = phoneList.get(key);
            System.out.printf("User: %s;\n",val.toString());
        }
    }

    public User findByPhone(String phone) {
        Integer key = null;
        for (Map.Entry<Integer, User> entry : phoneList.entrySet()) {
            if (entry.getValue().phone.equals(phone)) {
                key = entry.getKey();
                break;
            }
        }
        if (key != null) return phoneList.get(key);
        return null;
    }

    public User findByName(String name) {
        Integer key = null;
        for (Map.Entry<Integer, User> entry : phoneList.entrySet()) {
            if (entry.getValue().name.equals(name)) {
                key = entry.getKey();
                break;
            }
        }
        if (key != null) return phoneList.get(key);
        return null;
    }

    public void addUser(String name, String phone) {
        User user = new User();
        user.name = name; user.phone = phone;
        phoneList.put(phoneList.size()+1, user);
    }

}
