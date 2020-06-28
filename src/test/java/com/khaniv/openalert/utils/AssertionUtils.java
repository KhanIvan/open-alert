package com.khaniv.openalert.utils;

import com.khaniv.openalert.documents.BaseDocument;
import lombok.experimental.UtilityClass;
import org.junit.Assert;

import java.util.Collection;

/**
 * @author Ivan Khan
 */

@UtilityClass
public class AssertionUtils {
    public void assertEmptyCollection(Collection<?> collection) {
        Assert.assertNotNull(collection);
        Assert.assertTrue(collection.isEmpty());
    }

    public <T> void assertSingletonCollection(T expectedObject, Collection<T> collection) {
        Assert.assertNotNull(collection);
        Assert.assertEquals(1, collection.size());
        Assert.assertTrue(collection.contains(expectedObject));
    }

    public void assertBaseDocument(BaseDocument baseDocument) {
        Assert.assertNotNull(baseDocument);
        Assert.assertNotNull(baseDocument.getCreatedAt());
        Assert.assertNotNull(baseDocument.getUpdatedAt());
    }

    public void assertNewBaseDocument(BaseDocument baseDocument) {
        assertBaseDocument(baseDocument);
        Assert.assertEquals(baseDocument.getUpdatedAt(), baseDocument.getCreatedAt());
    }

    public void assertUpdatedBaseDocument(BaseDocument baseDocument) {
        assertBaseDocument(baseDocument);
        Assert.assertNotEquals(baseDocument.getUpdatedAt(), baseDocument.getCreatedAt());
    }
}
