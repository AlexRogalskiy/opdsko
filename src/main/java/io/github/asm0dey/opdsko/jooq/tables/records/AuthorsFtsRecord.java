/*
 * This file is generated by jOOQ.
 */
package io.github.asm0dey.opdsko.jooq.tables.records;


import io.github.asm0dey.opdsko.jooq.tables.AuthorsFts;
import io.github.asm0dey.opdsko.jooq.tables.interfaces.IAuthorsFts;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorsFtsRecord extends TableRecordImpl<AuthorsFtsRecord> implements Record5<String, String, String, String, Long>, IAuthorsFts {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>authors_fts.last_name</code>.
     */
    public AuthorsFtsRecord setLastName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>authors_fts.last_name</code>.
     */
    @Override
    public String getLastName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>authors_fts.first_name</code>.
     */
    public AuthorsFtsRecord setFirstName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>authors_fts.first_name</code>.
     */
    @Override
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>authors_fts.middle_name</code>.
     */
    public AuthorsFtsRecord setMiddleName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>authors_fts.middle_name</code>.
     */
    @Override
    public String getMiddleName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>authors_fts.nickname</code>.
     */
    public AuthorsFtsRecord setNickname(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>authors_fts.nickname</code>.
     */
    @Override
    public String getNickname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>authors_fts.id</code>.
     */
    public AuthorsFtsRecord setId(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>authors_fts.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, String, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return AuthorsFts.AUTHORS_FTS.LAST_NAME;
    }

    @Override
    public Field<String> field2() {
        return AuthorsFts.AUTHORS_FTS.FIRST_NAME;
    }

    @Override
    public Field<String> field3() {
        return AuthorsFts.AUTHORS_FTS.MIDDLE_NAME;
    }

    @Override
    public Field<String> field4() {
        return AuthorsFts.AUTHORS_FTS.NICKNAME;
    }

    @Override
    public Field<Long> field5() {
        return AuthorsFts.AUTHORS_FTS.ID;
    }

    @Override
    public String component1() {
        return getLastName();
    }

    @Override
    public String component2() {
        return getFirstName();
    }

    @Override
    public String component3() {
        return getMiddleName();
    }

    @Override
    public String component4() {
        return getNickname();
    }

    @Override
    public Long component5() {
        return getId();
    }

    @Override
    public String value1() {
        return getLastName();
    }

    @Override
    public String value2() {
        return getFirstName();
    }

    @Override
    public String value3() {
        return getMiddleName();
    }

    @Override
    public String value4() {
        return getNickname();
    }

    @Override
    public Long value5() {
        return getId();
    }

    @Override
    public AuthorsFtsRecord value1(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public AuthorsFtsRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public AuthorsFtsRecord value3(String value) {
        setMiddleName(value);
        return this;
    }

    @Override
    public AuthorsFtsRecord value4(String value) {
        setNickname(value);
        return this;
    }

    @Override
    public AuthorsFtsRecord value5(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuthorsFtsRecord values(String value1, String value2, String value3, String value4, Long value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    public void from(IAuthorsFts from) {
        setLastName(from.getLastName());
        setFirstName(from.getFirstName());
        setMiddleName(from.getMiddleName());
        setNickname(from.getNickname());
        setId(from.getId());
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuthorsFtsRecord
     */
    public AuthorsFtsRecord() {
        super(AuthorsFts.AUTHORS_FTS);
    }

    /**
     * Create a detached, initialised AuthorsFtsRecord
     */
    public AuthorsFtsRecord(String lastName, String firstName, String middleName, String nickname, Long id) {
        super(AuthorsFts.AUTHORS_FTS);

        setLastName(lastName);
        setFirstName(firstName);
        setMiddleName(middleName);
        setNickname(nickname);
        setId(id);
    }

    /**
     * Create a detached, initialised AuthorsFtsRecord
     */
    public AuthorsFtsRecord(io.github.asm0dey.opdsko.jooq.tables.pojos.AuthorsFts value) {
        super(AuthorsFts.AUTHORS_FTS);

        if (value != null) {
            setLastName(value.getLastName());
            setFirstName(value.getFirstName());
            setMiddleName(value.getMiddleName());
            setNickname(value.getNickname());
            setId(value.getId());
        }
    }
}
