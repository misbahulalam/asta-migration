package com.cefalo.asta;

import com.cefalo.asta.util.MySqlUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

/**
 * @author <a href="mailto:misbahulalam@gmail.com">Md. Misbahul Alam Chowdhury</a> on Aug 31, 2017
 * @since 1.0
 */
public class MySqlUtilTests {

    @Test
    public void testConnection() {
        Connection connection = MySqlUtil.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT 1 FROM dual");
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            int anInt = resultSet.getInt("1");
            assertEquals(1, anInt);
        } catch (SQLException e) {
            assert false;
        }
    }
}
