# Generate Green Button Certificate IDs

The Green Button Certification IDs are "version 5" UUIDs using RFC4122 (http://www.ietf.org/rfc/rfc4122.txt) which is the recognized standard.
 
The Green Button Certification ID is a one-way hash based on SHA-1 which is a secure non-reversible hash function. The construction of the UUID is called version 5 (note the method below allows you to compute them each time; the algorithm for constructing uuid is in section 4.3 of the RFC). 

   The requirements for these types of UUIDs are as follows:

- The UUIDs generated at different times from the same name in the same namespace MUST be equal.
- The UUIDs generated from two different names in the same namespace should be different (with very high probability).
- The UUIDs generated from the same name in two different namespaces should be different with (very high probability).
- If two UUIDs that were generated from names are equal, then they were generated from the same name in the same namespace (with very high probability).

This method of generating a UUID combines a scheme, a namespace, and a name to create a globally unique string that can be formed into a UUID. It is called “version 5” of the RFC4122 that allows the creation of a UUID based on three data elements:
- A namespaceUUIDType – for example NameSpace_URL from appendix C of the standard allows you to use a url for the namespace part (for this form, the NameSpace_URL value is 6ba7b811-9dad-11d1-80b4-00c04fd430c8 
- A namespace – if the type is NameSpace_URL, then an example namespace would be “services.greenbuttondata.org”
- A name – a unique name within the namespace. 

The form of the UUID recommended for use in ESPI is:

	urn:uuid:xxxxxxxx-xxxx-Mxxx-Nxxx-xxxxxxxxxxxx
 
(where M and N are defined in the standard and x are hexadecimal digits):

The value of M is 5 for version 5. The value of N is the most significant two bits of that character must be 0b10. That is values of 8,9,a,b are valid values of hex nibble N.


Their are two Java classes this project which implement the RFC4122 algorithm:

- GenGBACertId is the main class and provides the arguments required to calculate the Green Button Certificate ID
- GBACertID is the class that implements the RFC4122 algorithm.

Two run the Java Application perform the following steps:
- Import the Github repository (https://github.com/greenbuttonalliance/GenGBACertIDs.git into Eclipse
- Select the GenGBACertId.java file and select "Run As"
- In the pop-up window select the "1 Java Application" option

When the application completes the following lines will appear in the Eclipse Console Window:

    UUID NameSpace: org.greenbuttonalliance.cert
    UUID Name: 2016/01/18T20:16:40Z
    Type 5 UUID: d89df0e7-8108-5b45-bb94-f65d5413f815

The contents of the "Type 5 UUID:" line is the GBA/UL/UCAIug assigned Green Button Certificate ID
