package gem;

/** В этом перечислении определяется перечень форм камней
 * (либо в дальнейшем - типов вставок).
 * От формы камня зависит какие его параметры будут определяться:
 * ширина, длина, высота
 *
 * Так же от формы камня зависит формура вычисления его объёма, который нужен для
 * определения веса камня
 * Вес камня = Объём * Плотность
 * ИЛИ
 * Вторым вариантом вычисления веса камня может быть использование существующих таблиц,
 * которые содержат данные измереных камней с их размерами, цветом и весом.
 *
 * Наилучшим вариантом будет использование комплексного подхода,
 * т.е. определение веса камня по таблице, когда в ней содержатся данные (+- 1 мм),
 * а если в таблице отсутствуют данные, то подстчёт объёма и веса по формуле
 *
 * Данный класс инкапсулирует данные только об ограниченном списке форм.
 * Для определения размеров конкретной формы объект данного класса
 * передаётся в класс GemSize
 */
enum GemForm {
    ROUND("Круглый"),
    SPHERE("Бусина"), // только жемчуг?
    OVAL("Овал"),
    CABOCHON("Кабошон"),
    BAGUETTE("Багет"),
    MARQUIS("Маркиз"),
    CUBE("Квадрат"),
    HEART("Сердце"),
    TRIANGLE("Треугольник");
    //ANOTHER("Another");

    //TODO тип картинки, иконки или типа того
    // сейчас это текстовое описание формы камня
    String ruName;
    GemForm(String pic) {
        this.ruName = pic;
    }

    @Override
    public String toString() {
        return ruName;
    }

    // Константа, которая инициализируется при загрузке класса
    // Введена для отслеживания изменения количества форм
    public static final int formsQuantity = values().length;
}