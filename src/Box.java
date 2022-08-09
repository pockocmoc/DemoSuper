// Полная реализация класса BoxWeight

public class Box {
    private double width;
    private double height;
    private double depth;

    // сконструировать клон объекта

    Box(Box ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }
    // конструктор, применяемый при указании всех размеров

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // конструктор, применяемый в отсутствии всех размеров
    Box() {
        width = - 1; // значение -1 служит для обозначения
        height = - 1; // неинициализированного
        depth = - 1; // параллепипеда
    }
    // конструктор, применяемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }
    // расчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}
/*
  Теперь в классе BoxWeight полностью
  реализованы все кострукторы
 */
