package aufgabe20.wrapper;

import aufgabe20.annotation.SortMethod;

import java.lang.reflect.Method;

    public class MethodWithSortMethod implements Comparable<MethodWithSortMethod> {

        private Method method;

        private SortMethod sortMethod;

        public MethodWithSortMethod(Method method, SortMethod sortMethod) {
            this.method = method;
            this.sortMethod = sortMethod;
        }

        @Override
        public int compareTo(MethodWithSortMethod o) {
            return this.sortMethod.value().compareTo(o.getSortMethod().value());
        }

        public Method getMethod() {
            return method;
        }

        public SortMethod getSortMethod() {
            return sortMethod;
        }

    }


