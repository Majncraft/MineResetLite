package com.koletar.jj.mineresetlite;

public class CompositionEntry {
    private SerializableBlock block;
    private double chance;

    public CompositionEntry(SerializableBlock block, double chance) {
        this.block = block;
        this.chance = chance;
    }

    public SerializableBlock getBlock() {
        return block;
    }

    public double getChance() {
        return chance;
    }
}
