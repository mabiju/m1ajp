package s_reading_writing_objects;

import java.io.Serializable;

class a_student implements Serializable {
    int id;
    String name;

    a_student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
