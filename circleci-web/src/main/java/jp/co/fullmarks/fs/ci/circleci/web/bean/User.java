/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.fullmarks.fs.ci.circleci.web.bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import org.joda.time.LocalDate;
import org.joda.time.Years;

/**
 *
 * @author sugiyama
 */
@XmlRootElement
public class User implements Serializable {

    public enum Sex {

        MALE,
        FEMALE;

        @Override
        public String toString() {
            switch (this) {
                case MALE:
                    return "男";
                case FEMALE:
                    return "女";
            }
            return null;
        }
    }

    public String name;
    public Date birthday;
    public Date today = new Date();
    public Sex sex = Sex.MALE;
    public String occupation = "student";

    public User(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public int getAge() {
        Calendar to = Calendar.getInstance();
        to.setTime(this.birthday);

        Calendar from = Calendar.getInstance();
        from.setTime(this.today);

        return Years.yearsBetween(
                new LocalDate(to.get(Calendar.YEAR), to.get(Calendar.MONTH) + 1, to.get(Calendar.DAY_OF_MONTH)),
                new LocalDate(from.get(Calendar.YEAR), from.get(Calendar.MONTH) + 1, from.get(Calendar.DAY_OF_MONTH))
        ).getYears();
    }
}
