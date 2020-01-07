# EntityResolver
- Author: [HuiFer](https://github.com/huifer)
- 源码阅读仓库: [huifer-spring](https://github.com/huifer/spring-framework)
- 源码路径: `org.xml.sax.EntityResolver`,非Spring类

## DelegatingEntityResolver#resolveEntity
- org.springframework.beans.factory.xml.DelegatingEntityResolver.resolveEntity
```java
    @Override
    @Nullable
    public InputSource resolveEntity(@Nullable String publicId, @Nullable String systemId)
            throws SAXException, IOException {

        if (systemId != null) {
            if (systemId.endsWith(DTD_SUFFIX)) {
                return this.dtdResolver.resolveEntity(publicId, systemId);
            }
            else if (systemId.endsWith(XSD_SUFFIX)) {
                return this.schemaResolver.resolveEntity(publicId, systemId);
            }
        }

        // Fall back to the parser's default behavior.
        return null;
    }

```
