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



##获取 Class 对象
|  方法   |  案例 |
|  ----  | ----  |
| 调用getClass  | ``` Boolean var1 = true; Class<?>class Type2=var1.getClass();System.out.println(classType2);输出：class java.lang.Boolean```|
| 运用.class 语法  | ```Class<?> classType4 = Boolean.class;System.out.println(classType4);输出：class java.lang.Boolean``` |
| 通过 Class.forName()传入类的路径获取,运用static method Class.forName() | ```Class<?> classType5 = Class.forName("java.lang.Boolean");System.out.println(classType5);输出：class java.lang.Boolean``` |
| 运用primitive wrapper classes的TYPE 语法这里返回的是原生类型，和Boolean.class返回的不同| ```Class<?> classType3 =Boolean.TYPE;System.out.println(classType3);        输出：boolean``` |

##获取类的Fields
|  方法   |  用途 |
|  ----  | ----  |
| ```public Field getField(String name) ``` | 返回一个 Field 对象，它反映此 Class 对象所表示的类或接口的指定公共成员字段|
| ```public Field[] getFields() ```  | 返回一个包含某些 Field 对象的数组，这些对象反映此 Class 对象所表示的类或接口的所有可访问公共字段 |
| ``` public Field getDeclaredField(String name) ``` | 返回一个 Field 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明字段 |
| ``` public Field[] getDeclaredFields() ```| 返回 Field 对象的一个数组，这些对象反映此 Class 对象所表示的类或接口所声明的所有字段 |

##获取类的Method
|  方法   |  用途 |
|  ----  | ----  |
| ```public Method getMethod(String name,Class<?>...parameterTypes) ``` | 返回一个 Method 对象，它反映此 Class 对象所表示的类或接口的指定公共成员方法|
| ```public Method[] getMethods() ```  | 返回一个包含某些 Method 对象的数组，这些对象反映此 Class 对象所表示的类或接口（包括那些由该类或接口声明的以及从超类和超接口继承的那些的类或接口）的公共 member 方法 |
| ``` public Method getDeclaredMethod(String name,Class<?>...parameterTypes) ``` | 返回一个 Method 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明方法 |
| ``` public Method[] getDeclaredMethods() ```| 返回 Method 对象的一个数组，这些对象反映此 Class 对象表示的类或接口声明的所有方法，包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法|

##获取类的Constructor
|  方法   |  用途 |
|  ----  | ----  |
| ```public Constructor<T> getConstructor(String name,Class<?>...parameterTypes) ``` | 返回一个 Constructor 对象，它反映此 Class 对象所表示的类的指定公共构造方法|
| ```public Constructor<?>[] getConstructors() ```  | 返回一个包含某些 Constructor 对象的数组，这些对象反映此 Class 对象所表示的类的所有公共构造方法 |
| ``` public Constructor<T> getDeclaredConstructor(String name,Class<?>...parameterTypes) ``` | 返回一个 Constructor 对象，该对象反映此 Class 对象所表示的类或接口的指定构造方法 |
| ``` public Constructor<?>[] getDeclaredConstructors() ```| 返回 Constructor 对象的一个数组，这些对象反映此 Class 对象表示的类声明的所有构造方法。它们是公共、保护、默认（包）访问和私有构造方法|


