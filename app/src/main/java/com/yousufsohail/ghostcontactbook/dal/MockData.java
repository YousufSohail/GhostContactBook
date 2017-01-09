package com.yousufsohail.ghostcontactbook.dal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Yousuf Sohail on 05-Jan-17.
 */

public class MockData {

    /**
     * An array of sample (mock) items.
     */
    public static final List<MockItem> ITEMS = new ArrayList<MockItem>();

    /**
     * A map of sample (mock) items, by ID.
     */
    public static final Map<String, MockItem> ITEM_MAP = new HashMap<String, MockItem>();

    private static final int COUNT = 50;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createMockItem(i));
        }
    }

    private static void addItem(MockItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static MockItem createMockItem(int position) {
        return new MockItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A mock item representing a piece of content.
     */
    public static class MockItem {
        public final String id;
        public final String content;
        public final String details;

        public MockItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

//        @Override
//        public String toString() {
//            return content;
//        }
    }
}
