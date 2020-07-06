#反射机制

##定义
Java的反射（reflection）机制是指在程序的运行状态中，可以构造任意一个类的对象，可以了解任意一个对象所属的类，可以了解任意一个类的成员变量和方法，可以调用任意一个对象的属性和方法。这种动态获取程序信息以及动态调用对象的功能称为Java语言的反射机制。反射被视为动态语言的关键。

##用途

利用Java的反射机制通过反射来获取所需的私有成员或是方法

##反射机制的相关类

|  类名   |  用途 |
|  ----  | ----  |
| Class类  | 代表类的实体，在运行的Java应用程序中表示类和接口|
| Field类  | 代表类的成员变量（成员变量也称为类的属性） |
| Method类 | 代表类的方法 |
| Constructor 类| 代表类的构造方法 |

##获取 Class 对象的方式
|  方法   |  案例 |
|  ----  | ----  |
| 调用getClass  | ``` Boolean var1 = true; Class<?>class Type2=var1.getClass();System.out.println(classType2);输出：class java.lang.Boolean```|
| 运用.class 语法  | ```Class<?> classType4 = Boolean.class;System.out.println(classType4);输出：class java.lang.Boolean``` |
| 通过 Class.forName()传入类的路径获取,运用static method Class.forName() | ```Class<?> classType5 = Class.forName("java.lang.Boolean");System.out.println(classType5);输出：class java.lang.Boolean``` |
| 运用primitive wrapper classes的TYPE 语法这里返回的是原生类型，和Boolean.class返回的不同| ```Class<?> classType3 =Boolean.TYPE;System.out.println(classType3);        输出：boolean``` |


