package com.can.sandik.mapper;

import com.can.sandik.model.Constituency;
import org.springframework.batch.item.file.mapping.FieldSetMapper;

public static class ConstituencyFieldSetMapper implements FieldSetMapper<Constituency> {
    public Player mapFieldSet(FieldSet fieldSet) {
        Player player = new Player();

        player.setID(fieldSet.readString(0));
        player.setLastName(fieldSet.readString(1));
        player.setFirstName(fieldSet.readString(2));
        player.setPosition(fieldSet.readString(3));
        player.setBirthYear(fieldSet.readInt(4));
        player.setDebutYear(fieldSet.readInt(5));

        return player;
    }
}