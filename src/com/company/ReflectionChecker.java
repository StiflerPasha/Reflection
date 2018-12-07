package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionChecker {

    //Вывести: /*** имя Класса ***/
    public void showClassName(Object object) {
        Class clazz = object.getClass();
        System.out.println(clazz.getName());
        System.out.println();
    }

    //Вывести: /*** тип поля / имя поля = значение / модификатор доступа ***/
    public void showClassFields(Object object) throws IllegalAccessException {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field item : fields) {
            item.setAccessible(true);

            String fieldType = item.getType().getName();
            String fieldName = item.getName();
            Object fieldValue = item.get(object);
            String modifier = Modifier.toString(item.getModifiers());

            System.out.println(fieldType + " / " + fieldName + " = " + fieldValue + " / " + modifier);

            item.setAccessible(false);
        }
        System.out.println();
    }

    //Вывести: /*** имя метода (кол-во аргументов)[тип аргумента] / модификатор доступа ***/
    public void showClassMethods(Object object) {
        Class clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method item : methods) {
            String methodName = item.getName();
            int countParam = item.getParameterCount();
            String modifier = Modifier.toString(item.getModifiers());
            String paramType = Arrays.toString(item.getParameterTypes());

            System.out.println(methodName + " (" + countParam + paramType + ")" + " / " + modifier);
        }
    }

    //Для String: /***Зная имя поля (changeField), изменить его значение на другое (newValue)***/
    public void setStringValue(Object object, String changeField, String newValue) throws IllegalAccessException {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field item : fields) {
            item.setAccessible(true);

            if (item.getName().equals(changeField)) {
                item.set(object, newValue);
            }

            item.setAccessible(false);
        }
        System.out.println();
    }

    //Для int: /***Зная имя поля (changeField), изменить его значение на другое (newValue)***/
    public void setIntValue(Object object, String changeField, int newValue) throws IllegalAccessException {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field item : fields) {
            item.setAccessible(true);

            if (item.getName().equals(changeField)) {
                item.set(object, newValue);
            }

            item.setAccessible(false);
        }
        System.out.println();
    }
}
