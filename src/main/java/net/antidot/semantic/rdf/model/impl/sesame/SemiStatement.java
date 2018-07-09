/* 
 * Copyright 2011-2013 Antidot opensource@antidot.net
 * https://github.com/antidot/db2triples
 * 
 * This file is part of DB2Triples
 *
 * DB2Triples is free software; you can redistribute it and/or 
 * modify it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation; either version 2 of 
 * the License, or (at your option) any later version.
 * 
 * DB2Triples is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * RDF Semi Statement class
 *
 * Represents a semi-statement which is statement-like without subject.
 * 
 * Reference : R2RML: RDB to RDF Mapping Language, W3C Working Draft 24 March 2011
 *
 */
package net.antidot.semantic.rdf.model.impl.sesame;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Value;

public class SemiStatement {
	
	private IRI p;
	private Value o;
	
	public SemiStatement(IRI p, Value o){
		this.p = p;
		this.o = o;
	}
	
	
	public IRI getPredicate() {
		return p;
	}

	public void setPredicate(IRI p) {
		this.p = p;
	}

	public Value getObject() {
		return o;
	}

	public void setObject(Value o) {
		this.o = o;
	}
	
	public String toString(){
		return "[SemiStatement:toString] predicate = " + p + ", object = " + o;
	}

}
