package formation.repositories

import demoecommerce.Product
import formation.interfaces.IRepository
import grails.gorm.DetachedCriteria
import org.grails.datastore.gorm.GormStaticApi
import org.hibernate.Criteria
import org.hibernate.FetchMode
import org.hibernate.criterion.CriteriaSpecification
import org.hibernate.sql.JoinType
import org.hibernate.type.StringType

class ProductRepository implements IRepository<Product> {
    @Override
    void create(Product element) {
        element.save()
    }

    @Override
    void update(Product element) {

    }

    @Override
    void delete(Product element) {

    }

    @Override
    Product read(int id) {
        Product.findById(id)
    }

    @Override
    List<Product> readAll(Object closure) {
        Product.findAll()
    }

    List<Product> searchByAllField(String search) {
        //Closure Where
        /*def result = Product.where {
            title ==~ "%${search}%" || description ==~ "%${search}%"
        }*/
        //Exemple de composition
        /*def resultTitle = Product.where {
            title ==~ "%${search}%"
        }
        def resultTitleAndDescription = resultTitle.where {
            description ==~ "%${search}%"
        }
        //def result = Product.where(cl as DetachedCriteria<Product>)
        resultTitleAndDescription.list()*/

        //HQL
        def result = Product.findAll("from Product p where p.title like :search or p.description like :search",[search:"%${search}%"])
        //def result = Product.executeQuery("select p.id, p.title, p.description, i.url from Product p left join p.images i where p.title like :search or p.description like :search",[search:"%${search}%"])
        result
    }

    /*List<Product> getProductByCategory(def cat) {
        def result = Product.where {
            categories {
                id == cat
            }
        }
        result.list()
    }*/
    List<Product> getProductByCategory(int cat) {
        /*def result = Product.where {

            categories {
                id == cat
            }
        }
        result.list()*/


        //def c = Product.createCriteria()
        /*def result = c.list {
            categories{
                eq 'id', (long)cat
            }
            projections {
                sqlProjection 'title as titre',['titre']
            }
        }*/
        //def c = Product.createCriteria()
        /*def result = Product.withCriteria {
            categories{
                eq 'id', (long)cat
            }
            projections {
                sqlProjection 'title as titre',['titre'], [StringType]
            }
        }
        result*/
        //DetachedCriteria
        def c = new DetachedCriteria<Product>().build {
            categories{
                eq 'id', (long)cat
            }
        }

        def result = c.list()
        result

        //HQL
        /*def result = Product.executeQuery("select p from Product p, Category c where c.id = :id and c in elements(p.categories)",[id:(long)cat])
        result*/
    }

}
