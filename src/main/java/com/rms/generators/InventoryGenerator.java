package com.rms.generators;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class InventoryGenerator implements IdentifierGenerator {
	private static final String PREFIX = "INV";
	private static final AtomicLong SEQUENCE = new AtomicLong(1);

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String generatedId = PREFIX + "-" + SEQUENCE.getAndIncrement();
		return generatedId;
	}

}
