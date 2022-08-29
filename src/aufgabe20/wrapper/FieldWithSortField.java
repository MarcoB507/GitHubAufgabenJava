package aufgabe20.wrapper;

import aufgabe20.annotation.Sort;
import com.sun.jdi.Field;

import java.lang.reflect.Method;

public class FieldWithSortField implements Comparable<FieldWithSortField> {

        private Field field;

        private Sort sortField;

        public FieldWithSortField(Field field, Sort sortField) {
            this.field = field;
            this.sortField = sortField;
        }

    public FieldWithSortField(java.lang.reflect.Field f, Sort a) {
    }

//    public FieldWithSortField(java.lang.reflect.Field f, Sort a) {
//   }

    @Override
        public int compareTo(FieldWithSortField o) {
            return this.sortField.value().compareTo(o.getSortField().value());
        }

        public Field getField() {
            return field;
        }

        public Sort getSortField() {
            return sortField;
        }

    }


