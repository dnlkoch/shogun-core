package de.terrestris.shogun2.security.access.factory;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import de.terrestris.shogun2.model.PersistentObject;
import de.terrestris.shogun2.model.User;
import de.terrestris.shogun2.security.access.entity.PersistentObjectPermissionEvaluator;
import de.terrestris.shogun2.security.access.entity.UserPermissionEvaluator;

/**
 * @author Nils Bühner
 *
 */
public class EntityPermissionEvaluatorFactoryTest {

	@SuppressWarnings("rawtypes")
	EntityPermissionEvaluatorFactory entityPermissionEvaluatorFactory;

	@Before
	public void setUp() {
		entityPermissionEvaluatorFactory = new EntityPermissionEvaluatorFactory<>();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void getEntityPermissionEvaluator_shouldReturnUserEvaluatorForUserClass() {
		Class<User> userClass = User.class;

		PersistentObjectPermissionEvaluator entityPermissionEvaluator = entityPermissionEvaluatorFactory
				.getEntityPermissionEvaluator(userClass);

		assertThat(entityPermissionEvaluator, instanceOf(UserPermissionEvaluator.class));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void getEntityPermissionEvaluator_shouldReturnDefaultEvaluatorForPersistentObjects() {
		Class<PersistentObject> persistentObjectClass = PersistentObject.class;

		PersistentObjectPermissionEvaluator entityPermissionEvaluator = entityPermissionEvaluatorFactory
				.getEntityPermissionEvaluator(persistentObjectClass);

		assertThat(entityPermissionEvaluator, instanceOf(PersistentObjectPermissionEvaluator.class));
	}


}
