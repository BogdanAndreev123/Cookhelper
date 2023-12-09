package com.teamtb.cookhelper.ui.recipe;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public abstract class RecipesBook {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public static String RECIPE_1 = "{\"name\": \"Блины на пшенной каше\", \"id\": 44387, \"announce\": [\"Традиционный старинный рецепт – русские блины на пшенной каше.\"], \"description\": [\"Традиционный старинный рецепт – русские блины на пшенной каше. Тесто для пшенных блинов готовят на дрожжах, блинчики с пшеном получаются пышными и аппетитными.\"], \"ingredients\": [{\"name\": \"пшено\", \"count\": \"200 г\"}, {\"name\": \"мука пшеничная\", \"count\": \"400 г\"}, {\"name\": \"молоко\", \"count\": \"6 стаканов\"}, {\"name\": \"масло растительное (или сливочное)\", \"count\": \"2-4 ст. ложки\"}, {\"name\": \"дрожжи сухие активные\", \"count\": \"1 пачка (11 г)\"}, {\"name\": \"иди дрожжи прессованные\", \"count\": \"50 г\"}, {\"name\": \"сахар\", \"count\": \"2 ст. ложки\"}, {\"name\": \"яйца\", \"count\": \"2 шт.\"}, {\"name\": \"соль\", \"count\": \"1 щепотка\"}], \"steps\": [\"Продукты для приготовления пшенных блинов перед вами.\", \"Как приготовить блины пшенные: Пшено хорошо промыть.\", \"Пшено залить молоком (5 стаканов), довести до кипения. Убавить огонь до минимального. Сварить на молоке пшенную кашу средней густоты (около 30 минут) и охладить ее.\", \"Молоко подогреть. Развести дрожжи в 1/2 стакана молока.\", \"Выложить остуженную кашу в опарницу (миску) и влить дрожжи.\", \"Положить соль, яйца, сахар, масло. Перемешать.\", \"Просеять и добавить муку.\", \"Хорошо размешать, накрыть полотенцем, поставить в теплое место (на 40-60 минут), дать подняться тесту.\", \"Тесто поднялось, перемешать и приступить к выпечке.\", \"Сковороду разогреть, смазать растительным маслом (около 0,5 ч. ложки).\", \"Налить порцию теста на сковороду, распределить блин по всей поверхности сковороды. Печь блин до золотистого цвета на среднем огне (около 1-2 минут).\", \"Затем блин перевернуть и печь с другой стороны около 1 минуты. Так испечь все пшённые блины.\", \"Блины на пшённой каше готовы!\", \"Подавать пшенные блины со сливочным маслом, сметаной, вареньем, мёдом. Приятного аппетита!\"]}";

    public static Recipe parseRecipe(String jsonString) {
        return gson.fromJson(jsonString, Recipe.class);
    }
    public static ArrayList<Recipe> getRecipes() {
        ArrayList<Recipe> list = new ArrayList<>();

        list.add(parseRecipe(RECIPE_1));

        return list;
    }
}
